package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AnchorPointData {
    @Tag(tag=15) public Integer sceneId = null;
    @Tag(tag=13) public Vector rot = null;
    @Tag(tag=10) public Integer endTime = null;
    @Tag(tag=12) public Vector pos = null;
    @Tag(tag=11) public Integer anchorPointId = null;
}
