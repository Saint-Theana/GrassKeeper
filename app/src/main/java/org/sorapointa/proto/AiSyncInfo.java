package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AiSyncInfo {
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=2) public Boolean isSelfKilling = null;
    @Tag(tag=10) public Boolean hasPathToTarget = null;
}
