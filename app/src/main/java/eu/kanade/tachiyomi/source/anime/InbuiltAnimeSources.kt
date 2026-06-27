package eu.kanade.tachiyomi.source.anime

import android.content.Context
import ani.dantotsu.aniyomi.anime.sources.Miruro
import eu.kanade.tachiyomi.animesource.AnimeSource

object InbuiltAnimeSources {

    fun createSources(context: Context): List<AnimeSource> {
        val prefs = context.getSharedPreferences("miruro_inbuilt", Context.MODE_PRIVATE)
        return listOf(Miruro(prefs))
    }
}
