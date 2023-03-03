package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeFurnitureArrangementMuipData {
    @Tag(tag=1) public Integer furnitureId = null;
    @Tag(tag=2) public Vector spawnPos = null;
    @Tag(tag=3) public Vector spawnRot = null;
}
