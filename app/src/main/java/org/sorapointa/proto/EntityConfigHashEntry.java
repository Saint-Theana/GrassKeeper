package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityConfigHashEntry {
    @Tag(tag=3) public Integer entityId = null;
    @Tag(tag=12) public Integer jobId = null;
    @Tag(tag=6,isSigned=true) public Integer hashValue = null;
}
