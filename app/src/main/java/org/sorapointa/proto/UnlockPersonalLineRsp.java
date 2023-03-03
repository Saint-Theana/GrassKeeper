package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockPersonalLineRsp {
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer personalLineId = null;
    @Tag(tag=11) public Integer level = null;
    @Tag(tag=6) public Integer chapterId = null;
}
