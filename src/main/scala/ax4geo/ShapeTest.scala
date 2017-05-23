package ax4geo

import java.net.URL

import org.geotools.data.Query
import org.geotools.data.shapefile.ShapefileDataStore

class ShapeTest {
  def getCount(shapeFile: URL): Int = {
    val s = new ShapefileDataStore(shapeFile)
    val fs = s.getFeatureSource()
    val cnt = fs.getCount(Query.ALL)
    cnt
  }
}
