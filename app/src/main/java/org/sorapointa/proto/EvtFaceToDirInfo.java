package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtFaceToDirInfo {
    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=14) public Vector faceDir = null;
}
