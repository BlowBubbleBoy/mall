<template>
    <el-tree style="max-width: 600px" :data="treeData" :props="defaultProps" @node-click="handleNodeClick" />

</template>

<script lang="ts">
import { defineComponent, ref, onMounted } from "vue";
import axios from "axios";

interface Tree {
    label: string
    children?: Tree[]
}

export default defineComponent({
    setup() {
        // 使用 ref 定义响应式数据
        const treeData = ref<Tree[]>([]);
        const defaultProps = {
            children: "children",
            label: "label",
        };

        const handleNodeClick = (data: Tree) => {
            console.log(data);
        };

        const getDataList = async () => {
            try {
                const response = await axios.get('/product/pmscategory/tree/list');
                treeData.value = response.data; // 更新 treeData
                console.log(response.data);
            } catch (error) {
                console.error("获取数据失败", error);
            }
        };

        onMounted(() => {
            getDataList();
        });

        return {
            treeData,
            defaultProps,
            handleNodeClick,
        };
    },
});
</script>

<style scoped></style>