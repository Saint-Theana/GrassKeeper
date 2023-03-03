package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeMarkPointNPCData.*;
import org.sorapointa.proto.HomeMarkPointNPCData;
import org.sorapointa.proto.HomeMarkPointSuiteData.*;
import org.sorapointa.proto.HomeMarkPointSuiteData;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeMarkPointFurnitureData {
    @Tag(tag=1) public Integer guid = null;
    @Tag(tag=2) public Integer furnitureId = null;
    @Tag(tag=3) public Integer furnitureType = null;
    @Tag(tag=4) public Vector pos = null;
    @Tag(tag=6) public HomeMarkPointNPCData npcData = null;
    @Tag(tag=7) public HomeMarkPointSuiteData suiteData = null;
}
