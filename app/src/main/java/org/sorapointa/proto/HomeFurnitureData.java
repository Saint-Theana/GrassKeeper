package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeFurnitureData {
    @Tag(tag=6) public Integer version = null;
    @Tag(tag=3,isSigned=true) public Integer parentFurnitureIndex = null;
    @Tag(tag=4) public Integer furnitureId = null;
    @Tag(tag=9) public Integer guid = null;
    @Tag(tag=10) public Vector spawnRot = null;
    @Tag(tag=8) public Vector spawnPos = null;
}
