package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.MotionState.*;
import org.sorapointa.proto.MotionState;

public class MotionInfo {
    @Tag(tag=1) public Vector pos = null;
    @Tag(tag=2) public Vector rot = null;
    @Tag(tag=3) public Vector speed = null;
    @Tag(tag=4) public Integer state = null;
    @Tag(tag=5) public List<Vector> params = new ArrayList<>();
    @Tag(tag=6) public Vector refPos = null;
    @Tag(tag=7) public Integer refId = null;
    @Tag(tag=8) public Integer sceneTime = null;
    @Tag(tag=9) public Long intervalVelocity = null;
}
