package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MonsterAIConfigHashNotify {
    @Tag(tag=10) public Integer jobId = null;
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=11,isSigned=true) public Integer hashValue = null;
}
