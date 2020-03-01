package com.proxorov.mvvmtry.data.source.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.proxorov.mvvmtry.domain.model.NewsItem;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDAO_Impl implements NewsDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NewsItem> __insertionAdapterOfNewsItem;

  public NewsDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNewsItem = new EntityInsertionAdapter<NewsItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `news` (`name`,`description`,`urlToImage`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsItem value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrlToImage());
        }
      }
    };
  }

  @Override
  public Object insert(final NewsItem newsItem, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsItem.insert(newsItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<NewsItem>> getAllNews() {
    final String _sql = "SELECT * FROM news";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"news"}, false, new Callable<List<NewsItem>>() {
      @Override
      public List<NewsItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
          final List<NewsItem> _result = new ArrayList<NewsItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NewsItem _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpUrlToImage;
            _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
            _item = new NewsItem(_tmpName,_tmpDescription,_tmpUrlToImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
