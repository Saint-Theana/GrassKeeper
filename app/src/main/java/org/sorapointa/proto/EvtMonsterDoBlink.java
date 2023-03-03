package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtMonsterDoBlink {
    @Tag(tag=3) public Vector targetRot = null;
    @Tag(tag=7) public Vector targetPos = null;
    @Tag(tag=2) public Integer entityId = null;
}
