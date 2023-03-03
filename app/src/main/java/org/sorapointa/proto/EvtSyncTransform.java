package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtSyncTransform {
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=6) public Vector entityPos = null;
    @Tag(tag=1) public Vector entityRot = null;
}
