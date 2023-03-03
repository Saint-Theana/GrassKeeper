package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CancelCoopTaskRsp {
    @Tag(tag=1) public Integer chapterId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
