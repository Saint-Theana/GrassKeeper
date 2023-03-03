package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class OneofGatherPointDetectorData {
    @Tag(tag=7) public Vector hintCenterPos = null;
    @Tag(tag=14) public Integer hintRadius = null;
    @Tag(tag=10) public Integer materialId = null;
    @Tag(tag=6) public Integer configId = null;
    @Tag(tag=13) public Integer groupId = null;
    @Tag(tag=4) public Boolean isAllCollected = null;
    @Tag(tag=15) public Boolean isHintValid = null;
}
