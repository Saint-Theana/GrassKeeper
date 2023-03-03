package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReportFightAntiCheatNotify {
    @Tag(tag=8) public Integer cheatCount = null;
    @Tag(tag=12) public Integer cheatType = null;
}
