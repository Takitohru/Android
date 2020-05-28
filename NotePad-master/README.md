# 安卓基于NotePad的功能拓展
## 实现功能
* NoteList中显示条目增加时间戳显示
* 添加笔记查询功能（根据标题查询）
## 源码分析
实现显示条目增加时间戳需要完成以下内容
* 更改布局文件,添加一个TextView用于显示时间戳
  此处顺带为每个笔记添加一个标签图片
```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="100dp"
    android:orientation="horizontal">
    <ImageView
        android:layout_width="69dp"
        android:layout_height="88dp"
        android:background="@drawable/app_notes" />
    <LinearLayout  xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <TextView xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@android:id/text1"
        android:layout_width="match_parent"
        android:layout_height="?android:attr/listPreferredItemHeight"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:gravity="center_vertical"
        android:paddingLeft="5dip"
        android:singleLine="true"
        />
    <TextView
        android:id="@+id/date"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceSmall"
        android:paddingLeft="5dip"
        />
</LinearLayout>
</LinearLayout>
```
