package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SkyCrystalDetectorData {
    @Tag(tag=6) public Vector hintCenterPos = null;
    @Tag(tag=14) public Integer groupId = null;
    @Tag(tag=8) public Integer configId = null;
    @Tag(tag=3) public Boolean isHintValid = null;
}
