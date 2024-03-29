package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VectorPlane.*;
import org.sorapointa.proto.VectorPlane;

public class PolygonRegionSize {
    @Tag(tag=13,isFloat=true) public Float height = null;
    @Tag(tag=15) public List<VectorPlane> pointList = new ArrayList<>();
}
