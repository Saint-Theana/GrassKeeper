package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityConfigHashEntry {
    @Tag(tag=13) public Integer jobId = null;
    @Tag(tag=6,isSigned=true) public Integer hashValue = null;
    @Tag(tag=11) public Integer entityId = null;
}
