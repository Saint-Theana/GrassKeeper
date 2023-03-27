package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeFurnitureData {
    @Tag(tag=5) public Integer version = null;
    @Tag(tag=9,isSigned=true) public Integer parentFurnitureIndex = null;
    @Tag(tag=12) public Vector spawnRot = null;
    @Tag(tag=2) public Vector spawnPos = null;
    @Tag(tag=14) public Integer guid = null;
    @Tag(tag=11) public Integer furnitureId = null;
}
