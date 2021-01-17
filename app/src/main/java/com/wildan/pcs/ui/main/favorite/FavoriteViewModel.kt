package com.wildan.pcs.ui.main.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.wildan.pcs.ui.main.data.lokal.FavoriteUser
import com.wildan.pcs.ui.main.data.lokal.FavoriteUserDao
import com.wildan.pcs.ui.main.data.lokal.UserDatabase

class FavoriteViewModel(application: Application): AndroidViewModel(application) {

    private var userDao : FavoriteUserDao?
    private var userDb : UserDatabase?

    init {
        userDb = UserDatabase.getDatabase(application)
        userDao = userDb?.favoriteUserDao()
    }

    fun getFavoriteUser(): LiveData<List<FavoriteUser>>? {
        return userDao?.getFavoriteUser()
    }
}