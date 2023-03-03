package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VectorPlane.*;
import org.sorapointa.proto.VectorPlane;

public class PolygonRegionSize {
    @Tag(tag=5) public List<VectorPlane> pointList = new ArrayList<>();
    @Tag(tag=9,isFloat=true) public Float height = null;
}
