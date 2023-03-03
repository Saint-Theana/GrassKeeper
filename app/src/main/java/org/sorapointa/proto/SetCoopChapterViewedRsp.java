package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetCoopChapterViewedRsp {
    @Tag(tag=11) public Integer chapterId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
