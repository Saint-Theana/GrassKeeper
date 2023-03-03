package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeMarkPointFurnitureData.*;
import org.sorapointa.proto.HomeMarkPointFurnitureData;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeMarkPointSceneData {
    @Tag(tag=6) public List<HomeMarkPointFurnitureData> furnitureList = new ArrayList<>();
    @Tag(tag=4) public Vector teapotSpiritPos = null;
    @Tag(tag=2) public Integer sceneId = null;
    @Tag(tag=5) public Integer moduleId = null;
    @Tag(tag=11) public Vector safePointPos = null;
}
