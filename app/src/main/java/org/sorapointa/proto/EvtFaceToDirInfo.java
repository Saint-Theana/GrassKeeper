package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtFaceToDirInfo {
    @Tag(tag=2) public Vector faceDir = null;
    @Tag(tag=5) public Integer entityId = null;
}
