package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;

public class InBattleChessSettleInfo {
    @Tag(tag=9) public Integer oldChessExp = null;
    @Tag(tag=11) public Long sceneTimeMs = null;
    @Tag(tag=15) public Integer oldChessLevel = null;
    @Tag(tag=2) public Boolean isSuccess = null;
    @Tag(tag=1) public List<ExhibitionDisplayInfo> scoreList = new ArrayList<>();
    @Tag(tag=3) public Integer chessExp = null;
    @Tag(tag=10) public Integer chessLevel = null;
}
