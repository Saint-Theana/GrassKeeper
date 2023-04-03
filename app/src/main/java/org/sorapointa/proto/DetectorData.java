package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class DetectorData {
    @Tag(tag=2) public Boolean isHintValid = null;
    @Tag(tag=9) public Integer configId = null;
    @Tag(tag=3) public Vector hintCenterPos = null;
    @Tag(tag=10) public Integer materialId = null;
    @Tag(tag=13) public Boolean isAllCollected = null;
    @Tag(tag=14) public Integer groupId = null;
    @Tag(tag=5) public Integer hintRadius = null;
}
