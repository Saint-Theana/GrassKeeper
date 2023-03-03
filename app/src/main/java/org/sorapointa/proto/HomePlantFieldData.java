package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomePlantSubFieldData.*;
import org.sorapointa.proto.HomePlantSubFieldData;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomePlantFieldData {
    @Tag(tag=13) public List<HomePlantSubFieldData> subFieldList = new ArrayList<>();
    @Tag(tag=9) public Integer furnitureId = null;
    @Tag(tag=1) public Integer sceneId = null;
    @Tag(tag=10) public Integer fieldGuid = null;
    @Tag(tag=12) public Vector spawnPos = null;
}
