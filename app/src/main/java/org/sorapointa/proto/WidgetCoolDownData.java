package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetCoolDownData {
    @Tag(tag=8) public Integer id = null;
    @Tag(tag=15) public Long coolDownTime = null;
    @Tag(tag=12) public Boolean isSuccess = null;
}
