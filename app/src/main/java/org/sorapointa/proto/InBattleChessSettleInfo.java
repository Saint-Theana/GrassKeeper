package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;

public class InBattleChessSettleInfo {
    @Tag(tag=7) public Boolean isSuccess = null;
    @Tag(tag=11) public Integer chessExp = null;
    @Tag(tag=13) public Integer chessLevel = null;
    @Tag(tag=10) public Integer oldChessLevel = null;
    @Tag(tag=1) public List<ExhibitionDisplayInfo> scoreList = new ArrayList<>();
    @Tag(tag=14) public Long sceneTimeMs = null;
    @Tag(tag=2) public Integer oldChessExp = null;
}
