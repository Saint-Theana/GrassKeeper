package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtSyncTransform {
    @Tag(tag=10) public Integer entityId = null;
    @Tag(tag=5) public Vector entityRot = null;
    @Tag(tag=9) public Vector entityPos = null;
}
