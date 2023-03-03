package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AiSyncInfo {
    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=8) public Boolean isSelfKilling = null;
    @Tag(tag=4) public Boolean hasPathToTarget = null;
}
