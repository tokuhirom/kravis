package kravis.render

import kravis.GGPlot
import java.awt.Dimension
import java.io.File

/**
 * @author Holger Brandl
 */
class RserveDevice : RenderEngine() {
    override fun render(plot: GGPlot, format: File, preferredSize: Dimension?): File {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

internal fun GGPlot.saveTempFile(format: String = ".png") = save(createTempFile(suffix = format))
