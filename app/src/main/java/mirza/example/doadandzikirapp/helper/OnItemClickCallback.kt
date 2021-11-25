package mirza.example.doadandzikirapp.helper

import mirza.example.doadandzikirapp.model.Artikel

interface OnItemClickCallback {
    fun onItemClicked(data: Artikel)
}