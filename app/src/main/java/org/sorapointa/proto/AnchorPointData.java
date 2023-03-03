package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AnchorPointData {
    @Tag(tag=5) public Integer sceneId = null;
    @Tag(tag=9) public Integer anchorPointId = null;
    @Tag(tag=8) public Integer endTime = null;
    @Tag(tag=15) public Vector pos = null;
    @Tag(tag=2) public Vector rot = null;
}
