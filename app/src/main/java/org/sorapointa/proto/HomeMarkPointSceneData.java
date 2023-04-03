package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.HomeMarkPointFurnitureData.*;
import org.sorapointa.proto.HomeMarkPointFurnitureData;

public class HomeMarkPointSceneData {
    @Tag(tag=14) public List<HomeMarkPointFurnitureData> furnitureList = new ArrayList<>();
    @Tag(tag=5) public Integer moduleId = null;
    @Tag(tag=15) public Integer sceneId = null;
    @Tag(tag=10) public Vector safePointPos = null;
    @Tag(tag=8) public Vector teapotSpiritPos = null;
}
