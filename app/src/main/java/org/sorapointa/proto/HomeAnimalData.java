package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeAnimalData {
    @Tag(tag=13) public Vector spawnRot = null;
    @Tag(tag=10) public Integer furnitureId = null;
    @Tag(tag=4) public Vector spawnPos = null;
}
