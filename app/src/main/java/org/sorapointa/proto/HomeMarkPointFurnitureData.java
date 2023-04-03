package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.NpcData.*;
import org.sorapointa.proto.NpcData;
import org.sorapointa.proto.SuiteData.*;
import org.sorapointa.proto.SuiteData;

public class HomeMarkPointFurnitureData {
    @Tag(tag=1) public Integer guid = null;
    @Tag(tag=2) public Integer furnitureId = null;
    @Tag(tag=3) public Integer furnitureType = null;
    @Tag(tag=4) public Vector pos = null;
    @Tag(tag=6) public NpcData npcData = null;
    @Tag(tag=7) public SuiteData suiteData = null;
}
