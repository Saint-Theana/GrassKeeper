package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockCoopChapterRsp {
    @Tag(tag=4) public Integer chapterId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
