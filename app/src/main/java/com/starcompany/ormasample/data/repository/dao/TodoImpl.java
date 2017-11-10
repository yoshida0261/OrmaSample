package com.starcompany.ormasample.data.repository.dao;

import android.support.annotation.Nullable;

import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

@Table
public class TodoImpl {
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column(indexed = true)
    public String title;

    @Column
    @Nullable // allows NULL (default: NOT NULL)
    public String content;

    @Column
    public long createdTimeMillis;
}
