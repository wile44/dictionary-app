package com.plcoding.dictionary.feature_dictionary.data.local

import androidx.room.Database
import com.plcoding.dictionary.feature_dictionary.data.local.entity.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version =  1,
)
abstract class WordInfoDatabase {
}