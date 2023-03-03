package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetCoolDownData {
    @Tag(tag=5) public Boolean isSuccess = null;
    @Tag(tag=4) public Long coolDownTime = null;
    @Tag(tag=15) public Integer id = null;
}
