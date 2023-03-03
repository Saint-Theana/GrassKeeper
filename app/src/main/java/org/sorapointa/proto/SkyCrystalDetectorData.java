package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class SkyCrystalDetectorData {
    @Tag(tag=3) public Boolean isHintValid = null;
    @Tag(tag=8) public Vector hintCenterPos = null;
    @Tag(tag=6) public Integer groupId = null;
    @Tag(tag=9) public Integer configId = null;
}
