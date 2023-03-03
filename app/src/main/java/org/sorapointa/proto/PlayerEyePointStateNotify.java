package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CylinderRegionSize.*;
import org.sorapointa.proto.CylinderRegionSize;
import org.sorapointa.proto.PolygonRegionSize.*;
import org.sorapointa.proto.PolygonRegionSize;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class PlayerEyePointStateNotify {
    @Tag(tag=15) public Integer regionEntityId = null;
    @Tag(tag=1) public Vector eyePointPos = null;
    @Tag(tag=3) public Boolean isUseEyePoint = null;
    @Tag(tag=7) public Integer regionConfigId = null;
    @Tag(tag=12) public Integer regionShape = null;
    @Tag(tag=2) public Boolean isFilterStreamPos = null;
    @Tag(tag=5,isSigned=true) public Integer fixLodLevel = null;
    @Tag(tag=4) public Integer regionGroupId = null;
    @Tag(tag=255,isFloat=true) public Float sphereRadius = null;
    @Tag(tag=1823) public Vector cubicSize = null;
    @Tag(tag=1862) public CylinderRegionSize cylinderSize = null;
    @Tag(tag=877) public PolygonRegionSize polygonSize = null;
}
