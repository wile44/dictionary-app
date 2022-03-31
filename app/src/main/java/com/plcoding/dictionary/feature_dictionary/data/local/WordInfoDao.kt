package com.plcoding.dictionary.feature_dictionary.data.local

import android.provider.UserDictionary
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.plcoding.dictionary.feature_dictionary.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserWordInfo(infos: List<WordInfoEntity>)

    @Query("DELETE FROM wordinfoentity WHERE WORD IN(:words)")
    suspend fun deleteWordInfros(words: List<String>)

    @Query("SELECT * FROM wordinfoentity WHERE word LIKE '%' || :word || '%'")
    suspend fun getWordInfos(word: String): List<WordInfoEntity>
}