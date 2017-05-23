package ax4geo

import org.geotools.TestData
import org.geotools.data.Query
import org.scalatest.FunSuite


class ShapeTests extends FunSuite{

  test("Can count features in Shape file") {

    import org.geotools.data.shapefile.ShapefileDataStore
    val resource = "shapes/polygontest.shp"

    val url = TestData.url(resource)
    val testShp = new ShapefileDataStore(url)


    val expectedCnt = testShp.getCount(Query.ALL)
    val actualCnt = new ShapeTest().getCount(url)

    assert(actualCnt === expectedCnt)
  }

}
