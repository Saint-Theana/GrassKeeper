package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AISnapshotEntitySkillCycle {
    @Tag(tag=12) public Boolean failed = null;
    @Tag(tag=8) public Boolean trydoskill = null;
    @Tag(tag=9) public Boolean success = null;
    @Tag(tag=1) public Boolean selected = null;
    @Tag(tag=2) public Integer skillId = null;
}
