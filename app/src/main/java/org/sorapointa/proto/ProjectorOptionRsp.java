package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProjectorOptionRsp {
    @Tag(tag=10) public Integer entityId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer opType = null;
}
