class EassyHTTP{
    async put(url,data){
        const response = await fetch(url,{
            method:'PUT',
            headers:{
                'Content-type' : 'application/json'
            },
            body : JSON.stringify(data)
        });

        const resData = await response.json();

        return resData;
    }
}