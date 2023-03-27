package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtFaceToDirInfo {
    @Tag(tag=2) public Vector faceDir = null;
    @Tag(tag=5) public Integer entityId = null;
}
