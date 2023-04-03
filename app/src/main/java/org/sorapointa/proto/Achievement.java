package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Achievement_Status.*;
import org.sorapointa.proto.Achievement_Status;

public class Achievement {
    @Tag(tag=10) public Integer curProgress = null;
    @Tag(tag=13) public Integer id = null;
    @Tag(tag=14) public Integer totalProgress = null;
    @Tag(tag=5) public Integer status = null;
    @Tag(tag=6) public Integer finishTimestamp = null;
}
